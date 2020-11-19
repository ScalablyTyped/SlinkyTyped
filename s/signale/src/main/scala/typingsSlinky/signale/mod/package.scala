package typingsSlinky.signale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type LoggerFunc = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  
  type Signale[TTypes /* <: java.lang.String */] = typingsSlinky.signale.mod.SignaleBase[TTypes] with (typingsSlinky.std.Record[TTypes, typingsSlinky.signale.mod.LoggerFunc]) with typingsSlinky.signale.anon.RecordDefaultMethodsLogge
}
