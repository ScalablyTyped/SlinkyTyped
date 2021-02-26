package typingsSlinky.storybookRouter

import slinky.core.facade.ReactElement
import typingsSlinky.reachRouter.mod.LocationProviderProps
import typingsSlinky.reachRouter.mod.NavigateFn
import typingsSlinky.storybookRouter.anon.ReadonlyLocationProviderP
import typingsSlinky.storybookRouter.anon.Search
import typingsSlinky.storybookRouter.routerMod.QueryLinkProps
import typingsSlinky.storybookRouter.routerMod.QueryLocationProps
import typingsSlinky.storybookRouter.routerMod.QueryMatchProps
import typingsSlinky.storybookRouter.routerMod.RouteProps
import typingsSlinky.storybookRouter.utilsMod.Match
import typingsSlinky.storybookRouter.utilsMod.Query
import typingsSlinky.storybookRouter.utilsMod.StoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Link {
    
    @JSImport("@storybook/router", "Link")
    @js.native
    def apply(hasToChildrenRest: QueryLinkProps): ReactElement = js.native
    @JSImport("@storybook/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    @JSImport("@storybook/router", "Location")
    @js.native
    def apply(hasChildren: QueryLocationProps): ReactElement = js.native
    @JSImport("@storybook/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router", "LocationProvider")
  @js.native
  class LocationProvider protected ()
    extends typingsSlinky.storybookRouter.routerMod.LocationProvider {
    def this(props: LocationProviderProps) = this()
    def this(props: ReadonlyLocationProviderP) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocationProviderProps, context: js.Any) = this()
  }
  
  object Match {
    
    @JSImport("@storybook/router", "Match")
    @js.native
    def apply(hasChildrenPathStartsWith: QueryMatchProps): ReactElement = js.native
    @JSImport("@storybook/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Route {
    
    @JSImport("@storybook/router", "Route")
    @js.native
    def apply(hasPathChildrenStartsWithHideOnly: RouteProps): ReactElement = js.native
    @JSImport("@storybook/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router", "getMatch")
  @js.native
  def getMatch(current: String, target: String): Match | Null = js.native
  @JSImport("@storybook/router", "getMatch")
  @js.native
  def getMatch(current: String, target: String, startsWith: js.Any): Match | Null = js.native
  
  @JSImport("@storybook/router", "navigate")
  @js.native
  val navigate: NavigateFn = js.native
  
  @JSImport("@storybook/router", "parsePath")
  @js.native
  def parsePath(): StoryData = js.native
  @JSImport("@storybook/router", "parsePath")
  @js.native
  def parsePath(path: String): StoryData = js.native
  
  @JSImport("@storybook/router", "queryFromLocation")
  @js.native
  def queryFromLocation(location: Search): Query = js.native
  
  @JSImport("@storybook/router", "queryFromString")
  @js.native
  def queryFromString(s: String): Query = js.native
  
  @JSImport("@storybook/router", "stringifyQuery")
  @js.native
  def stringifyQuery(query: Query): js.Any = js.native
}
