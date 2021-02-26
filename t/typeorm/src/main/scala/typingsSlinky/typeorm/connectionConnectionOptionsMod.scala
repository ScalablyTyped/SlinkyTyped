package typingsSlinky.typeorm

import typingsSlinky.typeorm.typeormStrings.`aurora-data-api-pg`
import typingsSlinky.typeorm.typeormStrings.`aurora-data-api`
import typingsSlinky.typeorm.typeormStrings.`better-sqlite3`
import typingsSlinky.typeorm.typeormStrings.`react-native`
import typingsSlinky.typeorm.typeormStrings.cockroachdb
import typingsSlinky.typeorm.typeormStrings.cordova
import typingsSlinky.typeorm.typeormStrings.expo
import typingsSlinky.typeorm.typeormStrings.mariadb
import typingsSlinky.typeorm.typeormStrings.mongodb
import typingsSlinky.typeorm.typeormStrings.mssql
import typingsSlinky.typeorm.typeormStrings.mysql
import typingsSlinky.typeorm.typeormStrings.nativescript
import typingsSlinky.typeorm.typeormStrings.oracle
import typingsSlinky.typeorm.typeormStrings.postgres
import typingsSlinky.typeorm.typeormStrings.sap
import typingsSlinky.typeorm.typeormStrings.sqlite
import typingsSlinky.typeorm.typeormStrings.sqljs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionConnectionOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions
    - typingsSlinky.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions
    - typingsSlinky.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions
    - typingsSlinky.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions
    - typingsSlinky.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions
    - typingsSlinky.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions
    - typingsSlinky.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions
    - typingsSlinky.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions
    - typingsSlinky.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions
    - typingsSlinky.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions
    - typingsSlinky.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions
    - typingsSlinky.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions
    - typingsSlinky.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions
    - typingsSlinky.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions
    - typingsSlinky.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions
    - typingsSlinky.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
  */
  trait ConnectionOptions extends StObject
  object ConnectionOptions {
    
    @scala.inline
    def AuroraDataApiConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api`
    ): typingsSlinky.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.auroraDataApiAuroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api-pg`
    ): typingsSlinky.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.auroraDataApiPgAuroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String, `type`: `better-sqlite3`): typingsSlinky.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.betterSqlite3BetterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(`type`: cockroachdb): typingsSlinky.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.cockroachdbCockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String, `type`: cordova): typingsSlinky.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.cordovaCordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any, `type`: expo): typingsSlinky.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.expoExpoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(`type`: mongodb): typingsSlinky.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.mongodbMongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typingsSlinky.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.mysqlMysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any, `type`: nativescript): typingsSlinky.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.nativescriptNativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(`type`: oracle): typingsSlinky.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.oracleOracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(`type`: postgres): typingsSlinky.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.postgresPostgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String, `type`: `react-native`): typingsSlinky.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.reactNativeReactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(`type`: sap): typingsSlinky.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sapSapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(`type`: mssql): typingsSlinky.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqlserverSqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String, `type`: sqlite): typingsSlinky.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqliteSqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(`type`: sqljs): typingsSlinky.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqljsSqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
