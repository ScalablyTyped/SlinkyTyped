package typingsSlinky.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PageType extends js.Object

@JSGlobal("SP.PageType")
@js.native
object PageType extends js.Object {
  @js.native
  sealed trait defaultView extends PageType
  
  @js.native
  sealed trait dialogView extends PageType
  
  @js.native
  sealed trait displayForm extends PageType
  
  @js.native
  sealed trait displayFormDialog extends PageType
  
  @js.native
  sealed trait editForm extends PageType
  
  @js.native
  sealed trait editFormDialog extends PageType
  
  @js.native
  sealed trait invalid extends PageType
  
  @js.native
  sealed trait newForm extends PageType
  
  @js.native
  sealed trait newFormDialog extends PageType
  
  @js.native
  sealed trait normalView extends PageType
  
  @js.native
  sealed trait pAGE_MAXITEMS extends PageType
  
  @js.native
  sealed trait solutionForm extends PageType
  
  @js.native
  sealed trait view extends PageType
  
  /* 1 */ val defaultView: typingsSlinky.sharepoint.SP.PageType.defaultView with Double = js.native
  /* 3 */ val dialogView: typingsSlinky.sharepoint.SP.PageType.dialogView with Double = js.native
  /* 5 */ val displayForm: typingsSlinky.sharepoint.SP.PageType.displayForm with Double = js.native
  /* 6 */ val displayFormDialog: typingsSlinky.sharepoint.SP.PageType.displayFormDialog with Double = js.native
  /* 7 */ val editForm: typingsSlinky.sharepoint.SP.PageType.editForm with Double = js.native
  /* 8 */ val editFormDialog: typingsSlinky.sharepoint.SP.PageType.editFormDialog with Double = js.native
  /* 0 */ val invalid: typingsSlinky.sharepoint.SP.PageType.invalid with Double = js.native
  /* 9 */ val newForm: typingsSlinky.sharepoint.SP.PageType.newForm with Double = js.native
  /* 10 */ val newFormDialog: typingsSlinky.sharepoint.SP.PageType.newFormDialog with Double = js.native
  /* 2 */ val normalView: typingsSlinky.sharepoint.SP.PageType.normalView with Double = js.native
  /* 12 */ val pAGE_MAXITEMS: typingsSlinky.sharepoint.SP.PageType.pAGE_MAXITEMS with Double = js.native
  /* 11 */ val solutionForm: typingsSlinky.sharepoint.SP.PageType.solutionForm with Double = js.native
  /* 4 */ val view: typingsSlinky.sharepoint.SP.PageType.view with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PageType with Double] = js.native
}

