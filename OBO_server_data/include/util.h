#ifndef __UTIL_H_
#define __UTIL_H_

#include "config.h"

#define CONFIG_PATH         "./conf/OBO_server_data.conf"

#define IP_LEN              18
#define PORT_LEN            6

//mysql
#define DB_NAME_LEN         20
#define SQL_LEN             1024
#define DB_USERNAME_LEN     128
#define DB_PASSWD_LEN       128

//redis



typedef struct db_config {

    char db_ip[IP_LEN];
    char db_port[PORT_LEN];
    char db_basename[DB_NAME_LEN];
    char db_username[DB_USERNAME_LEN];
    char db_passwd[DB_PASSWD_LEN];


    char cache_ip[IP_LEN];
    char cache_port[PORT_LEN];

}db_config_t;



extern db_config_t g_db_config;


void config_init();

char *make_response_json(int ret, char *reason);

#endif
