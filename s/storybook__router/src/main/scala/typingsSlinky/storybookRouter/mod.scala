package typingsSlinky.storybookRouter

import slinky.core.facade.ReactElement
import typingsSlinky.reachRouter.mod.LocationProviderProps
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.react.mod.Component
import typingsSlinky.storybookRouter.anon.Path
import typingsSlinky.storybookRouter.anon.Search
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import typingsSlinky.storybookRouter.routerMod.QueryLocationProps
import typingsSlinky.storybookRouter.routerMod.QueryMatchProps
import typingsSlinky.storybookRouter.routerMod.RouteProps
import typingsSlinky.storybookRouter.utilsMod.Query
import typingsSlinky.storybookRouter.utilsMod.StoryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@storybook/router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getMatch(current: String, target: String): Path = js.native
  def getMatch(current: String, target: String, startsWith: js.Any): Path = js.native
  
  val navigate: NavigateFn = js.native
  
  def parsePath(): StoryData = js.native
  def parsePath(path: String): StoryData = js.native
  
  def queryFromLocation(location: Search): Query = js.native
  
  def queryFromString(s: String): Query = js.native
  
  def stringifyQuery(query: Query): js.Any = js.native
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(parseKind, sanitize, storyNameFromExport) */ def toId(kind: String, name: String): String = js.native
  
  @js.native
  object Link extends js.Object {
    
    def apply(hasToChildrenRest: QueryLinkProps): ReactElement = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object Location extends js.Object {
    
    def apply(hasChildren: QueryLocationProps): ReactElement = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  class LocationProvider ()
    extends Component[LocationProviderProps, js.Object, js.Any]
  
  @js.native
  object Match extends js.Object {
    
    def apply(hasChildrenPathStartsWith: QueryMatchProps): ReactElement = js.native
    
    var displayName: String = js.native
  }
  
  @js.native
  object Route extends js.Object {
    
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): ReactElement = js.native
    
    var displayName: String = js.native
  }
}
