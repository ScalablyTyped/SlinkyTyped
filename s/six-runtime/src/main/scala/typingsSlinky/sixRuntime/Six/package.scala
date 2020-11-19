package typingsSlinky.sixRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Six {
  
  type middleware = js.Function2[/* ctx */ js.Object, /* next */ typingsSlinky.sixRuntime.Six.next, js.Any]
  
  type next = js.Function0[js.Any]
}
