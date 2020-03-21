package typingsSlinky.testingLibraryVue.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.testingLibraryDom.queryHelpersMod.AllByAttribute
import typingsSlinky.testingLibraryDom.queryHelpersMod.BuiltQueryMethods
import typingsSlinky.testingLibraryDom.queryHelpersMod.GetAllBy
import typingsSlinky.testingLibraryDom.queryHelpersMod.QueryByAttribute_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/vue", "queryHelpers")
@js.native
object queryHelpers extends js.Object {
  val queryAllByAttribute: AllByAttribute = js.native
  val queryByAttribute: QueryByAttribute_ = js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  def getElementError(message: String, container: HTMLElement): js.Error = js.native
}

