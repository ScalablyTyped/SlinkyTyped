package typingsSlinky.semanticUiReact.mod

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbComponent
import typingsSlinky.semanticUiReact.breadcrumbBreadcrumbMod.BreadcrumbProps
import typingsSlinky.semanticUiReact.breadcrumbSectionMod.BreadcrumbSectionProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "Breadcrumb")
@js.native
class Breadcrumb protected ()
  extends Component[BreadcrumbProps, js.Object, js.Any] {
  def this(props: BreadcrumbProps) = this()
  def this(props: BreadcrumbProps, context: js.Any) = this()
}
object Breadcrumb extends Shortcut {
  
  @JSImport("semantic-ui-react", "Breadcrumb")
  @js.native
  val ^ : BreadcrumbComponent = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react", "Breadcrumb.Section")
  @js.native
  class Section protected ()
    extends Component[BreadcrumbSectionProps, js.Object, js.Any] {
    def this(props: BreadcrumbSectionProps) = this()
    def this(props: BreadcrumbSectionProps, context: js.Any) = this()
  }
  
  type _To = BreadcrumbComponent
  
  /* This means you don't have to write `^`, but can instead just say `Breadcrumb.foo` */
  override def _to: BreadcrumbComponent = ^
}
