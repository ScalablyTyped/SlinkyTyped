package typingsSlinky.useMediaAntdQuery

import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.lg
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.md
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.sm
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xl
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xs
import typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-media-antd-query", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* keyof use-media-antd-query.AnonLg */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xs
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.sm
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.md
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.lg
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xl
    - typingsSlinky.useMediaAntdQuery.useMediaAntdQueryStrings.xxl
  */
  trait MediaQueryKey extends js.Object
  
  def default(): xs | sm | md | lg | xl | xxl = js.native
  def getScreenClassName(): xs | sm | md | lg | xl | xxl = js.native
  @js.native
  object MediaQueryEnum extends js.Object {
    var lg: AnonMaxWidth = js.native
    var md: AnonMaxWidth = js.native
    var sm: AnonMaxWidth = js.native
    var xl: AnonMaxWidth = js.native
    var xs: AnonMatchMedia = js.native
    var xxl: AnonMinWidth = js.native
  }
  
}

