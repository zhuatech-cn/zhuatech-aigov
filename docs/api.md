# AIGOV API 摘要

版权所有 © 2026 上海如静知华信息科技有限公司。

| 方法 | 路径 | 说明 |
| --- | --- | --- |
| POST | `/api/auth/login` | 登录并获取 JWT |
| GET | `/api/admin/dashboard` | AI 治理全局指标 |
| GET | `/api/admin/work-orders` | AI 系统评审任务 |
| GET | `/api/shopfloor/dashboard` | 评审员工作台 |
| POST | `/api/shopfloor/work-orders/{id}/reports` | 提交控制项和证据评审结果 |
| POST | `/api/shopfloor/ai-risk-assessment` | 执行可解释的 AI 风险分级与上线建议 |

除登录外均需 `Authorization: Bearer <token>`。高风险评分会返回所需控制项和证据清单，便于前端形成整改任务。
