package typingsSlinky.testingLibraryVue.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.testingLibraryDom.queryHelpersMod.BuiltQueryMethods
import typingsSlinky.testingLibraryDom.queryHelpersMod.GetAllBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/vue", "buildQueries")
@js.native
object buildQueries extends js.Object {
  
  def apply[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
}
