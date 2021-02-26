package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.postgresPostgresConnectionCredentialsOptionsMod.PostgresConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasterPostgresConnectionCredentialsOptions extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: PostgresConnectionCredentialsOptions = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[PostgresConnectionCredentialsOptions] = js.native
}
object MasterPostgresConnectionCredentialsOptions {
  
  @scala.inline
  def apply(
    master: PostgresConnectionCredentialsOptions,
    slaves: js.Array[PostgresConnectionCredentialsOptions]
  ): MasterPostgresConnectionCredentialsOptions = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasterPostgresConnectionCredentialsOptions]
  }
  
  @scala.inline
  implicit class MasterPostgresConnectionCredentialsOptionsMutableBuilder[Self <: MasterPostgresConnectionCredentialsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: PostgresConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaves(value: js.Array[PostgresConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: PostgresConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
