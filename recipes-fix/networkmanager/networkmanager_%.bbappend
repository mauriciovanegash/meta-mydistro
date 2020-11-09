# RCONFLICTS_ makes the installation to fail when different versions of connman are present
RCONFLICTS_${PN}_remove = "connman"
RREPLACES_${PN} = "connman"