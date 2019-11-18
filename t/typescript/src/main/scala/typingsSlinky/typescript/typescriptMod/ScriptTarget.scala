package typingsSlinky.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScriptTarget extends js.Object

@JSImport("typescript", "ScriptTarget")
@js.native
object ScriptTarget extends js.Object {
  @js.native
  sealed trait ES2015 extends ScriptTarget
  
  @js.native
  sealed trait ES2016 extends ScriptTarget
  
  @js.native
  sealed trait ES2017 extends ScriptTarget
  
  @js.native
  sealed trait ES2018 extends ScriptTarget
  
  @js.native
  sealed trait ES2019 extends ScriptTarget
  
  @js.native
  sealed trait ES2020 extends ScriptTarget
  
  @js.native
  sealed trait ES3 extends ScriptTarget
  
  @js.native
  sealed trait ES5 extends ScriptTarget
  
  @js.native
  sealed trait ESNext extends ScriptTarget
  
  @js.native
  sealed trait JSON extends ScriptTarget
  
  @js.native
  sealed trait Latest extends ScriptTarget
  
  /* 2 */ val ES2015: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2015 with Double = js.native
  /* 3 */ val ES2016: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2016 with Double = js.native
  /* 4 */ val ES2017: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2017 with Double = js.native
  /* 5 */ val ES2018: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2018 with Double = js.native
  /* 6 */ val ES2019: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2019 with Double = js.native
  /* 7 */ val ES2020: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES2020 with Double = js.native
  /* 0 */ val ES3: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES3 with Double = js.native
  /* 1 */ val ES5: typingsSlinky.typescript.typescriptMod.ScriptTarget.ES5 with Double = js.native
  /* 99 */ val ESNext: typingsSlinky.typescript.typescriptMod.ScriptTarget.ESNext with Double = js.native
  /* 100 */ val JSON: typingsSlinky.typescript.typescriptMod.ScriptTarget.JSON with Double = js.native
  /* 99 */ val Latest: typingsSlinky.typescript.typescriptMod.ScriptTarget.Latest with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScriptTarget with Double] = js.native
}

