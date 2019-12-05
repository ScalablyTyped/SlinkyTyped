package typingsSlinky.atTestingDashLibraryReact.atTestingDashLibraryReactMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.AllByAttribute
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.BuiltQueryMethods
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.GetAllBy
import typingsSlinky.atTestingDashLibraryDom.queryDashHelpersMod.QueryByAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react", "queryHelpers")
@js.native
object queryHelpers extends js.Object {
  val queryAllByAttribute: AllByAttribute = js.native
  val queryByAttribute: QueryByAttribute = js.native
  def buildQueries[Arguments /* <: js.Array[_] */](
    queryByAll: GetAllBy[Arguments],
    getMultipleError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String],
    getMissingError: js.Function2[/* container */ HTMLElement, /* args */ Arguments, String]
  ): BuiltQueryMethods[Arguments] = js.native
  def getElementError(message: String, container: HTMLElement): js.Error = js.native
}

