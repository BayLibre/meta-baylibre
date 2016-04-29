inherit core-image
inherit mksdcard

INC_PR = "r0"

IMAGE_FEATURES += "dev-pkgs"

DEPENDS += "linux-yocto-mainline"

FSTYPE_VIRT ?= "ext3"

IMAGE_INSTALL += "util-linux"
IMAGE_INSTALL += "util-linux-blkid"
IMAGE_INSTALL += "util-linux-mount"
IMAGE_INSTALL += "acme-utils"

IMAGE_BOOT_FILES += "zImage am335x-boneblack.dtb uEnv.txt"
