package com.togoisperfect.servicemaids.resource;
import com.togoisperfect.servicemaids.model.ExtraServiceCatalog;
import com.togoisperfect.servicemaids.service.ExtraServiceCatalogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/v1/extra-services")
@AllArgsConstructor
public class ExtraServiceCatalogResource {

    private final ExtraServiceCatalogService extraServiceCatalogService;

    @GetMapping
    public List<ExtraServiceCatalog> getAllExtras() {
        return extraServiceCatalogService.getAllExtras();
    }

    @PostMapping
    public ExtraServiceCatalog createExtra(@RequestBody ExtraServiceCatalog extra) {
        return extraServiceCatalogService.createExtra(extra);
    }

    @DeleteMapping("/{id}")
    public void deleteExtra(@PathVariable Long id) {
        extraServiceCatalogService.deleteExtra(id);
    }
}

