SELECT stadium, count(*)
FROM game
JOIN goal
ON (goal.matchid=game.id)
GROUP BY stadium;