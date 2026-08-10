/* Copyright 2026 上海如静知华信息科技有限公司 */
package cn.zhuatech.aigov.controller;

import cn.zhuatech.aigov.common.ApiResponse;
import cn.zhuatech.aigov.service.HumanOversightReadinessService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aigov/insights")
public class HumanOversightReadinessController {
    private final HumanOversightReadinessService service;
    public HumanOversightReadinessController(HumanOversightReadinessService service) { this.service = service; }
    @PostMapping("/human-oversight-readiness")
    public ApiResponse<HumanOversightReadinessService.Result> evaluate(
        @Valid @RequestBody HumanOversightReadinessService.Request request) {
        return ApiResponse.ok(service.evaluate(request));
    }
}
