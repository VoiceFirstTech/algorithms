# Swap all f and m values
/*
| id | name | sex | salary |
|----|------|-----|--------|
| 1  | A    | m   | 2500   |
| 2  | B    | f   | 1500   |
| 3  | C    | m   | 5500   |
| 4  | D    | f   | 500    |
*/
UPDATE salary
SET sex =
    CASE sex WHEN "m" THEN "f" ELSE "m" END
