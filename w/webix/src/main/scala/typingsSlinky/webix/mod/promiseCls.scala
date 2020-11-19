package typingsSlinky.webix.mod

import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webix", "promise")
@js.native
class promiseCls protected ()
  extends Promise[js.Any] {
  def this(executor: js.Function2[
        /* resolve */ js.Function1[/* value */ js.UndefOr[js.Any], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        Unit
      ]) = this()
}
