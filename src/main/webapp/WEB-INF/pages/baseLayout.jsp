<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <titleStruts Tiles Project</title>
</head>
<body>
    <div id="header">
        <tiles:insertAttribute name="header" />
    </div>

    <div id="body">
        <tiles:insertAttribute name="body" />
    </div>
</body>
</html>