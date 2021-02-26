package typingsSlinky.typeorm.anon

import typingsSlinky.typeorm.cockroachConnectionCredentialsOptionsMod.CockroachConnectionCredentialsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Master extends StObject {
  
  /**
    * Master server used by orm to perform writes.
    */
  val master: CockroachConnectionCredentialsOptions = js.native
  
  /**
    * List of read-from severs (slaves).
    */
  val slaves: js.Array[CockroachConnectionCredentialsOptions] = js.native
}
object Master {
  
  @scala.inline
  def apply(
    master: CockroachConnectionCredentialsOptions,
    slaves: js.Array[CockroachConnectionCredentialsOptions]
  ): Master = {
    val __obj = js.Dynamic.literal(master = master.asInstanceOf[js.Any], slaves = slaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[Master]
  }
  
  @scala.inline
  implicit class MasterMutableBuilder[Self <: Master] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaster(value: CockroachConnectionCredentialsOptions): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlaves(value: js.Array[CockroachConnectionCredentialsOptions]): Self = StObject.set(x, "slaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlavesVarargs(value: CockroachConnectionCredentialsOptions*): Self = StObject.set(x, "slaves", js.Array(value :_*))
  }
}
