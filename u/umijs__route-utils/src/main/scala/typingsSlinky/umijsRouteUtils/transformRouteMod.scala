package typingsSlinky.umijsRouteUtils

import typingsSlinky.umijsRouteUtils.anon.Breadcrumb
import typingsSlinky.umijsRouteUtils.typesMod.MenuDataItem
import typingsSlinky.umijsRouteUtils.typesMod.MessageDescriptor
import typingsSlinky.umijsRouteUtils.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformRouteMod {
  
  /**
    * @param routes 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(routes: js.Array[Route]): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(routes: js.Array[Route], locale: Boolean): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.UndefOr[scala.Nothing],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = js.native
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Default)
  @js.native
  def default(
    routes: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = js.native
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", "getKeyByPath")
  @js.native
  def getKeyByPath(item: MenuDataItem): js.UndefOr[String] = js.native
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", "isUrl")
  @js.native
  def isUrl(path: String): Boolean = js.native
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", "stripQueryStringAndHashFromPath")
  @js.native
  def stripQueryStringAndHashFromPath(url: String): String = js.native
}
