package Tuan2.DiemQuynh5554.Controllers;

import Tuan2.DiemQuynh5554.entities.Book;
import Tuan2.DiemQuynh5554.services.BookService;
import lombok.RequiredArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping
    public String showAllBooks(@NotNull Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/list";
    }
    @GetMapping("/add")
    public String addBookForm(Model model) {
        model.addAttribute("book", new Book());
        return "book/add";
    }
    @PostMapping("/add")
    public String addBook(@ModelAttribute("book") Book book, Model model) {
        if (isBookInfoIncomplete(book)) {
            model.addAttribute("error", "Please fill in all fields.");
            return "book/add";
        }
        if (bookService.getBookById(book.getId()).isEmpty()) {
            bookService.addBook(book);
        }
        return "redirect:/books";
    }

    private boolean isBookInfoIncomplete(Book book) {
        return book.getTitle() == null || book.getTitle().isEmpty() ||
                book.getAuthor() == null || book.getAuthor().isEmpty() ||
                book.getPrice() == null ||
                book.getCategory() == null || book.getCategory().isEmpty();
    }
    @GetMapping("/edit/{id}")
    public String editBookForm(@NotNull Model model, @PathVariable long id)
    {
        var book = bookService.getBookById(id).orElse(null);
        model.addAttribute("book", book != null ? book : new Book());
        return "book/edit";
    }
    @PostMapping("/edit")
    public String editBook(@ModelAttribute("book") Book book, Model model) {
        if (isBookInfoIncomplete(book)) {
            model.addAttribute("error", "Vui lòng điền đầy đủ thông tin!");
            return "book/edit";
        }
        bookService.updateBook(book);
        return "redirect:/books";
    }
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
        if (bookService.getBookById(id).isPresent())
            bookService.deleteBookById(id);
        return "redirect:/books";
    }


}

