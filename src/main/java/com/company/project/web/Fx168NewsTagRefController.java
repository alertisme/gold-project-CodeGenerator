package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TFx168NewsTagRef;
import com.company.project.service.Fx168NewsTagRefService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ISME on 2017/08/31.
*/
@RestController
@RequestMapping("/t/fx168/news/tag/ref")
public class Fx168NewsTagRefController {
    @Resource
    private Fx168NewsTagRefService fx168NewsTagRefService;

    @PostMapping("/add")
    public Result add(TFx168NewsTagRef tFx168NewsTagRef) {
        fx168NewsTagRefService.save(tFx168NewsTagRef);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        fx168NewsTagRefService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TFx168NewsTagRef tFx168NewsTagRef) {
        fx168NewsTagRefService.update(tFx168NewsTagRef);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TFx168NewsTagRef tFx168NewsTagRef = fx168NewsTagRefService.findById(id);
        return ResultGenerator.genSuccessResult(tFx168NewsTagRef);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TFx168NewsTagRef> list = fx168NewsTagRefService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
