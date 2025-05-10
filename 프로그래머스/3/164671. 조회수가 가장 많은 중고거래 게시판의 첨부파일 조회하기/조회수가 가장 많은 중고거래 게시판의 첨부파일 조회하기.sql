SELECT CONCAT('/home/grep/src/', f.board_id, '/',file_id, file_name, file_ext) AS 'FILE_PATH'
FROM (SELECT board_id, views
      FROM used_goods_board
      ORDER BY views DESC LIMIT 1) b JOIN used_goods_file f ON b.board_id = f.board_id
ORDER BY file_id DESC