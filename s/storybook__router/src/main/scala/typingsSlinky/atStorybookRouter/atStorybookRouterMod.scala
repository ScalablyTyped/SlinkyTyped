package typingsSlinky.atStorybookRouter

import typingsSlinky.atReachRouter.atReachRouterMod.LocationProviderProps
import typingsSlinky.atStorybookRouter.distRouterMod.QueryLinkProps
import typingsSlinky.atStorybookRouter.distRouterMod.QueryLocationProps
import typingsSlinky.atStorybookRouter.distRouterMod.QueryMatchProps
import typingsSlinky.atStorybookRouter.distRouterMod.RouteProps
import typingsSlinky.atStorybookRouter.distUtilsMod.Query
import typingsSlinky.atStorybookRouter.distUtilsMod.SeparatorOptions
import typingsSlinky.atStorybookRouter.distUtilsMod.StoryData
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object atStorybookRouterMod extends js.Object {
  @js.native
  class LocationProvider ()
    extends Component[LocationProviderProps, js.Object, js.Any]
  
  def getMatch(current: String, target: String): Anon_Path = js.native
  def getMatch(current: String, target: String, startsWith: Boolean): Anon_Path = js.native
  def navigate(to: String): Unit = js.native
  def parseKind(kind: String, hasRootSeparatorGroupSeparator: SeparatorOptions): Anon_Groups = js.native
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  def queryFromLocation(location: Anon_Search): Query = js.native
  def queryFromString(s: String): Query = js.native
  def sanitize(string: String): String = js.native
  def storyNameFromExport(key: String): String = js.native
  def stringifyQuery(query: Query): js.Any = js.native
  def toId(kind: String, name: String): String = js.native
  @js.native
  object Link extends js.Object {
    var displayName: String = js.native
    def apply(hasToChildrenRest: QueryLinkProps): Element = js.native
  }
  
  @js.native
  object Location extends js.Object {
    var displayName: String = js.native
    def apply(hasChildren: QueryLocationProps): Element = js.native
  }
  
  @js.native
  object Match extends js.Object {
    var displayName: String = js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): Element = js.native
  }
  
  @js.native
  object Route extends js.Object {
    var displayName: String = js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = js.native
  }
  
}

