package typingsSlinky.uirouterCore.anon

import typingsSlinky.uirouterCore.globMod.Glob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameGlob extends StObject {
  
  /** Might be null */
  var nameGlob: js.UndefOr[Glob] = js.native
}
object NameGlob {
  
  @scala.inline
  def apply(): NameGlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NameGlob]
  }
  
  @scala.inline
  implicit class NameGlobMutableBuilder[Self <: NameGlob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNameGlob(value: Glob): Self = StObject.set(x, "nameGlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameGlobUndefined: Self = StObject.set(x, "nameGlob", js.undefined)
  }
}
