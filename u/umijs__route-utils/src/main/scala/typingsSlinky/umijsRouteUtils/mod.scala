package typingsSlinky.umijsRouteUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.umijsRouteUtils.anon.Breadcrumb
import typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem
import typingsSlinky.umijsRouteUtils.typesMod.MessageDescriptor
import typingsSlinky.umijsRouteUtils.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@umijs/route-utils", "getFlatMenus")
  @js.native
  def getFlatMenus(): StringDictionary[MenuDataItem] = js.native
  @JSImport("@umijs/route-utils", "getFlatMenus")
  @js.native
  def getFlatMenus(menuData: js.Array[MenuDataItem]): StringDictionary[MenuDataItem] = js.native
  
  @JSImport("@umijs/route-utils", "getMatchMenu")
  @js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem]): js.Array[MenuDataItem] = js.native
  @JSImport("@umijs/route-utils", "getMatchMenu")
  @js.native
  def getMatchMenu(pathname: String, menuData: js.Array[MenuDataItem], fullKeys: Boolean): js.Array[MenuDataItem] = js.native
  
  /**
    * @param routes 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(routes: js.Array[Route]): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(routes: js.Array[Route], locale: Boolean): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils", "transformRoute")
  @js.native
  def transformRoute(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
}
