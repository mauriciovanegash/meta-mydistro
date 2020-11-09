require mydistro-image.bb

SUMMARY = "MyDistro development image"

DESCRIPTION = "Image with Sato, a mobile environment and visual style for \
mobile devices. The image supports X11 with a Sato theme, Pimlico \
applications, and contains terminal, editor, and file manager."

IMAGE_FEATURES += "dev-pkgs tools-sdk"
