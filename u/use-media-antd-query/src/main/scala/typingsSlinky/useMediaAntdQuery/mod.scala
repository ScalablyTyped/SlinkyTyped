package typingsSlinky.useMediaAntdQuery

import typingsSlinky.useMediaAntdQuery.anon.MatchMedia
import typingsSlinky.useMediaAntdQuery.anon.MaxWidth
import typingsSlinky.useMediaAntdQuery.anon.MinWidth
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-media-antd-query", JSImport.Default)
  @js.native
  def default(): xs | sm | md | lg | xl | xxl = js.native
  
  object MediaQueryEnum {
    
    @JSImport("use-media-antd-query", "MediaQueryEnum")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.lg")
    @js.native
    def lg: MaxWidth = js.native
    @scala.inline
    def lg_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lg")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.md")
    @js.native
    def md: MaxWidth = js.native
    @scala.inline
    def md_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("md")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.sm")
    @js.native
    def sm: MaxWidth = js.native
    @scala.inline
    def sm_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sm")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xl")
    @js.native
    def xl: MaxWidth = js.native
    @scala.inline
    def xl_=(x: MaxWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xl")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xs")
    @js.native
    def xs: MatchMedia = js.native
    @scala.inline
    def xs_=(x: MatchMedia): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xs")(x.asInstanceOf[js.Any])
    
    @JSImport("use-media-antd-query", "MediaQueryEnum.xxl")
    @js.native
    def xxl: MinWidth = js.native
    @scala.inline
    def xxl_=(x: MinWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("xxl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("use-media-antd-query", "getScreenClassName")
  @js.native
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  
  /* keyof use-media-antd-query.anon.Lg */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends StObject
}
