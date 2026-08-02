# AIGOV 架构

版权所有 © 2026 上海如静知华信息科技有限公司。

Vue 管理端和 H5 通过 JWT 访问 Spring Boot REST API。领域层管理 AI 系统、评审任务、控制证据和决策记录；`AiRiskAssessmentService` 以确定性规则完成风险初筛；JPA 与 Flyway 管理 MySQL 数据。

管理角色为 `DOMAIN_OPERATOR`、`QUALITY`、`ADMIN`，评审员为 `DOMAIN_USER`。生产落地应将模型、数据和评测制品存入受控对象存储，并接入企业身份、审批及审计系统。
