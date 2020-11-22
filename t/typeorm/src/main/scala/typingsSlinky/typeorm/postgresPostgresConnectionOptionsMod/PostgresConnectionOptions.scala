package typingsSlinky.typeorm.postgresPostgresConnectionOptionsMod

import typingsSlinky.typeorm.anon.MasterPostgresConnectionCredentialsOptions
import typingsSlinky.typeorm.connectionBaseConnectionOptionsMod.BaseConnectionOptions
import typingsSlinky.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typingsSlinky.typeorm.postgresPostgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import typingsSlinky.typeorm.typeormStrings.`uuid-ossp`
import typingsSlinky.typeorm.typeormStrings.pgcrypto
import typingsSlinky.typeorm.typeormStrings.postgres
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostgresConnectionOptions
  extends BaseConnectionOptions
     with PostgresConnectionCredentialsOptions
     with ConnectionOptions {
  
  /**
    * The milliseconds before a timeout occurs during the initial connection to the postgres
    * server. If undefined, or set to 0, there is no timeout. Defaults to undefined.
    */
  val connectTimeoutMS: js.UndefOr[Double] = js.native
  
  /**
    * Include notification messages from Postgres server in client logs
    */
  val logNotifications: js.UndefOr[Boolean] = js.native
  
  val poolErrorHandler: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * Replication setup.
    */
  val replication: js.UndefOr[MasterPostgresConnectionCredentialsOptions] = js.native
  
  /**
    * Schema name.
    */
  val schema: js.UndefOr[String] = js.native
  
  /**
    * Database type.
    */
  @JSName("type")
  val type_PostgresConnectionOptions: postgres = js.native
  
  /**
    * The Postgres extension to use to generate UUID columns. Defaults to uuid-ossp.
    * If pgcrypto is selected, TypeORM will use the gen_random_uuid() function from this extension.
    * If uuid-ossp is selected, TypeORM will use the uuid_generate_v4() function from this extension.
    */
  val uuidExtension: js.UndefOr[pgcrypto | `uuid-ossp`] = js.native
}
object PostgresConnectionOptions {
  
  @scala.inline
  def apply(`type`: postgres): PostgresConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostgresConnectionOptions]
  }
  
  @scala.inline
  implicit class PostgresConnectionOptionsOps[Self <: PostgresConnectionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: postgres): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutMS(value: Double): Self = this.set("connectTimeoutMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeoutMS: Self = this.set("connectTimeoutMS", js.undefined)
    
    @scala.inline
    def setLogNotifications(value: Boolean): Self = this.set("logNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogNotifications: Self = this.set("logNotifications", js.undefined)
    
    @scala.inline
    def setPoolErrorHandler(value: /* err */ js.Any => _): Self = this.set("poolErrorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePoolErrorHandler: Self = this.set("poolErrorHandler", js.undefined)
    
    @scala.inline
    def setReplication(value: MasterPostgresConnectionCredentialsOptions): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setUuidExtension(value: pgcrypto | `uuid-ossp`): Self = this.set("uuidExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuidExtension: Self = this.set("uuidExtension", js.undefined)
  }
}
