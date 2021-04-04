package com.ashish.Swagger.Controller;
import com.ashish.Swagger.model.Author;
import com.ashish.Swagger.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
@RestController
@RequestMapping(value = "/author")
@Api(value = "Author's API", description = "Author's Details")
public class AuthorController
{
    @Autowired
    public AuthorService authorService;
    @RequestMapping(value="/getAllAuthors" ,method= RequestMethod.GET)
    @ApiOperation(value = "GET Authors", notes = "GET all the authors")
    public ArrayList<Author> getAllAuthors()
    {
       return authorService.getAllAuthor();
    }
    @RequestMapping(value = "/addAuthor", method = RequestMethod.POST)

    @ApiOperation(value = "POST Authors", notes = "Post an Author, and returns the added author back.")
    public Author addAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

}
