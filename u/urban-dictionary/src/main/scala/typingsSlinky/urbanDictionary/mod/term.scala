package typingsSlinky.urbanDictionary.mod

import typingsSlinky.urbanDictionary.anon.Entries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("urban-dictionary", "term")
@js.native
object term extends js.Object {
  
  def apply(word: String): js.Promise[Entries] = js.native
  def apply(
    word: String,
    callback: js.Function4[
      /* error */ js.Error, 
      /* entries */ js.Array[WordDefinition], 
      /* tags */ js.Array[String], 
      /* sounds */ js.Array[String], 
      _
    ]
  ): js.Promise[Entries] = js.native
}
