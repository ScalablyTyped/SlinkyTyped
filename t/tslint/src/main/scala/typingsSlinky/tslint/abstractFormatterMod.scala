package typingsSlinky.tslint

import typingsSlinky.tslint.formatterMod.IFormatter
import typingsSlinky.tslint.formatterMod.IFormatterMetadata
import typingsSlinky.tslint.ruleMod.RuleFailure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/formatter/abstractFormatter", JSImport.Namespace)
@js.native
object abstractFormatterMod extends js.Object {
  @js.native
  abstract class AbstractFormatter () extends IFormatter {
    /* protected */ def sortFailures(failures: js.Array[RuleFailure]): js.Array[RuleFailure] = js.native
  }
  
  /* static members */
  @js.native
  object AbstractFormatter extends js.Object {
    var metadata: IFormatterMetadata = js.native
  }
  
}

