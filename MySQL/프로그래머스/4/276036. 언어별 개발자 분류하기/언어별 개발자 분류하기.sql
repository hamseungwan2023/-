-- 코드를 작성해주세요
SELECT 
    CASE 
        WHEN (d.SKILL_CODE & fe_codes.code_sum > 0) AND (d.SKILL_CODE & py_code.CODE > 0) THEN 'A'
        WHEN (d.SKILL_CODE & cs_code.CODE > 0) THEN 'B'
        WHEN (d.SKILL_CODE & fe_codes.code_sum > 0) THEN 'C'
    END AS GRADE,
    d.ID,
    d.EMAIL
FROM 
    DEVELOPERS d
JOIN 
    (SELECT SUM(CODE) AS code_sum
     FROM SKILLCODES 
     WHERE CATEGORY = 'Front End') fe_codes
JOIN 
    SKILLCODES py_code ON py_code.NAME = 'Python'
JOIN 
    SKILLCODES cs_code ON cs_code.NAME = 'C#'
WHERE 
    (d.SKILL_CODE & fe_codes.code_sum > 0 AND d.SKILL_CODE & py_code.CODE > 0)
    OR (d.SKILL_CODE & cs_code.CODE > 0)
    OR (d.SKILL_CODE & fe_codes.code_sum > 0)
ORDER BY 
    GRADE ASC, d.ID ASC;