package typingsSlinky.tstl.tstlModuleMod

import typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator.SourceType
import typingsSlinky.tstl.ipushbackMod.IPushBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/module", "back_inserter")
@js.native
object backInserter extends js.Object {
  
  def apply[Source /* <: js.Array[_] | IPushBack[_] */](source: Source): typingsSlinky.tstl.backInsertIteratorMod.BackInsertIterator[SourceType[Source]] = js.native
}
