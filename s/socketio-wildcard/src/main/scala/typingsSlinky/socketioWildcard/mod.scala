package typingsSlinky.socketioWildcard

import typingsSlinky.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("socketio-wildcard", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): js.Function2[
    /* socket */ Socket | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ js.Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]], 
    Unit
  ] = js.native
  def apply(emitterCtor: js.Object): js.Function2[
    /* socket */ Socket | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientSocket */ js.Any), 
    /* next */ js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Any], Unit]], 
    Unit
  ] = js.native
}
