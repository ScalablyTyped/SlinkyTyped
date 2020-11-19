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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-media-antd-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): xs | sm | md | lg | xl | xxl = js.native
  
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  
  @js.native
  object MediaQueryEnum extends js.Object {
    
    var lg: MaxWidth = js.native
    
    var md: MaxWidth = js.native
    
    var sm: MaxWidth = js.native
    
    var xl: MaxWidth = js.native
    
    var xs: MatchMedia = js.native
    
    var xxl: MinWidth = js.native
  }
  
  /* keyof use-media-antd-query.anon.Lg */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends js.Object
}
