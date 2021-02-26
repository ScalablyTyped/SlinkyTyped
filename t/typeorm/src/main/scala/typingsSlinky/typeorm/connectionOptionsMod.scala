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

object connectionOptionsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions
    - typingsSlinky.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions
    - typingsSlinky.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions
    - typingsSlinky.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions
    - typingsSlinky.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions
    - typingsSlinky.typeorm.sapConnectionOptionsMod.SapConnectionOptions
    - typingsSlinky.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions
    - typingsSlinky.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions
    - typingsSlinky.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions
    - typingsSlinky.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions
    - typingsSlinky.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions
    - typingsSlinky.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions
    - typingsSlinky.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions
    - typingsSlinky.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions
    - typingsSlinky.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions
    - typingsSlinky.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions
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
    ): typingsSlinky.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.auroraDataApiConnectionOptionsMod.AuroraDataApiConnectionOptions]
    }
    
    @scala.inline
    def AuroraDataApiPostgresConnectionOptions(
      database: String,
      region: String,
      resourceArn: String,
      secretArn: String,
      `type`: `aurora-data-api-pg`
    ): typingsSlinky.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], secretArn = secretArn.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.auroraDataApiPostgresConnectionOptionsMod.AuroraDataApiPostgresConnectionOptions]
    }
    
    @scala.inline
    def BetterSqlite3ConnectionOptions(database: String, `type`: `better-sqlite3`): typingsSlinky.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.betterSqlite3ConnectionOptionsMod.BetterSqlite3ConnectionOptions]
    }
    
    @scala.inline
    def CockroachConnectionOptions(`type`: cockroachdb): typingsSlinky.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.cockroachConnectionOptionsMod.CockroachConnectionOptions]
    }
    
    @scala.inline
    def CordovaConnectionOptions(database: String, location: String, `type`: cordova): typingsSlinky.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.cordovaConnectionOptionsMod.CordovaConnectionOptions]
    }
    
    @scala.inline
    def ExpoConnectionOptions(database: String, driver: js.Any, `type`: expo): typingsSlinky.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.expoConnectionOptionsMod.ExpoConnectionOptions]
    }
    
    @scala.inline
    def MongoConnectionOptions(`type`: mongodb): typingsSlinky.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.mongoConnectionOptionsMod.MongoConnectionOptions]
    }
    
    @scala.inline
    def MysqlConnectionOptions(`type`: mysql | mariadb): typingsSlinky.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.mysqlConnectionOptionsMod.MysqlConnectionOptions]
    }
    
    @scala.inline
    def NativescriptConnectionOptions(database: String, driver: js.Any, `type`: nativescript): typingsSlinky.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], driver = driver.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.nativescriptConnectionOptionsMod.NativescriptConnectionOptions]
    }
    
    @scala.inline
    def OracleConnectionOptions(`type`: oracle): typingsSlinky.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.oracleConnectionOptionsMod.OracleConnectionOptions]
    }
    
    @scala.inline
    def PostgresConnectionOptions(`type`: postgres): typingsSlinky.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.postgresConnectionOptionsMod.PostgresConnectionOptions]
    }
    
    @scala.inline
    def ReactNativeConnectionOptions(database: String, location: String, `type`: `react-native`): typingsSlinky.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.reactNativeConnectionOptionsMod.ReactNativeConnectionOptions]
    }
    
    @scala.inline
    def SapConnectionOptions(`type`: sap): typingsSlinky.typeorm.sapConnectionOptionsMod.SapConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sapConnectionOptionsMod.SapConnectionOptions]
    }
    
    @scala.inline
    def SqlServerConnectionOptions(`type`: mssql): typingsSlinky.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqlServerConnectionOptionsMod.SqlServerConnectionOptions]
    }
    
    @scala.inline
    def SqliteConnectionOptions(database: String, `type`: sqlite): typingsSlinky.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions = {
      val __obj = js.Dynamic.literal(database = database.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqliteConnectionOptionsMod.SqliteConnectionOptions]
    }
    
    @scala.inline
    def SqljsConnectionOptions(`type`: sqljs): typingsSlinky.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.typeorm.sqljsConnectionOptionsMod.SqljsConnectionOptions]
    }
  }
}
