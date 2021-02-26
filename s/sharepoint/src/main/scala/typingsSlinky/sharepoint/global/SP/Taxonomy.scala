package typingsSlinky.sharepoint.global.SP

import typingsSlinky.sharepoint.SP.FieldCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Taxonomy {
  
  @JSGlobal("SP.Taxonomy.ChangeInformation")
  @js.native
  class ChangeInformation protected ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangeInformation {
    def this(context: typingsSlinky.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.ChangeItemType")
  @js.native
  object ChangeItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType with Double] = js.native
    
    /* 3 */ val group: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.group with Double = js.native
    
    /* 5 */ val site: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.site with Double = js.native
    
    /* 1 */ val term: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.term with Double = js.native
    
    /* 2 */ val termSet: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.termSet with Double = js.native
    
    /* 4 */ val termStore: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.termStore with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.sharepoint.SP.Taxonomy.ChangeItemType.unknown with Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangeOperationType")
  @js.native
  object ChangeOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType with Double] = js.native
    
    /* 1 */ val add: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.add with Double = js.native
    
    /* 5 */ val copy: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.copy with Double = js.native
    
    /* 3 */ val deleteObject: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.deleteObject with Double = js.native
    
    /* 2 */ val edit: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.edit with Double = js.native
    
    /* 8 */ val importObject: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.importObject with Double = js.native
    
    /* 7 */ val merge: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.merge with Double = js.native
    
    /* 4 */ val move: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.move with Double = js.native
    
    /* 6 */ val pathChange: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.pathChange with Double = js.native
    
    /* 9 */ val restore: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.restore with Double = js.native
    
    /* 0 */ val unknown: typingsSlinky.sharepoint.SP.Taxonomy.ChangeOperationType.unknown with Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangedGroup")
  @js.native
  class ChangedGroup ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedItem")
  @js.native
  class ChangedItem ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedSite")
  @js.native
  class ChangedSite ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedSite
  
  @JSGlobal("SP.Taxonomy.ChangedTerm")
  @js.native
  class ChangedTerm ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedTerm
  
  @JSGlobal("SP.Taxonomy.ChangedTermSet")
  @js.native
  class ChangedTermSet ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedTermSet
  
  @JSGlobal("SP.Taxonomy.ChangedTermStore")
  @js.native
  class ChangedTermStore ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.ChangedTermStore
  
  @JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
  @js.native
  class CustomPropertyMatchInformation protected ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.CustomPropertyMatchInformation {
    def this(context: typingsSlinky.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.Label")
  @js.native
  class Label ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.Label
  
  @JSGlobal("SP.Taxonomy.LabelMatchInformation")
  @js.native
  class LabelMatchInformation protected ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.LabelMatchInformation {
    def this(context: typingsSlinky.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.MobileTaxonomyField")
  @js.native
  class MobileTaxonomyField ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.MobileTaxonomyField
  
  @JSGlobal("SP.Taxonomy.StringMatchOption")
  @js.native
  object StringMatchOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sharepoint.SP.Taxonomy.StringMatchOption with Double] = js.native
    
    /* 1 */ val exactMatch: typingsSlinky.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch with Double = js.native
    
    /* 0 */ val startsWith: typingsSlinky.sharepoint.SP.Taxonomy.StringMatchOption.startsWith with Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyField")
  @js.native
  class TaxonomyField protected ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TaxonomyField {
    def this(context: typingsSlinky.sharepoint.SP.ClientContext, fields: FieldCollection, filedName: String) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
  @js.native
  class TaxonomyFieldValue ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TaxonomyFieldValue
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
  @js.native
  class TaxonomyFieldValueCollection protected ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TaxonomyFieldValueCollection {
    def this(
      context: typingsSlinky.sharepoint.SP.ClientContext,
      fieldValue: String,
      creatingField: typingsSlinky.sharepoint.SP.Field
    ) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyItem")
  @js.native
  class TaxonomyItem ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TaxonomyItem
  object TaxonomyItem {
    
    /* static member */
    @JSGlobal("SP.Taxonomy.TaxonomyItem.normalizeName")
    @js.native
    def normalizeName(context: typingsSlinky.sharepoint.SP.ClientContext, name: String): typingsSlinky.sharepoint.SP.StringResult = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomySession")
  @js.native
  class TaxonomySession ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TaxonomySession
  object TaxonomySession {
    
    /* static member */
    @JSGlobal("SP.Taxonomy.TaxonomySession.getTaxonomySession")
    @js.native
    def getTaxonomySession(context: typingsSlinky.sharepoint.SP.ClientContext): typingsSlinky.sharepoint.SP.Taxonomy.TaxonomySession = js.native
  }
  
  @JSGlobal("SP.Taxonomy.Term")
  @js.native
  class Term ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.Term
  
  @JSGlobal("SP.Taxonomy.TermGroup")
  @js.native
  class TermGroup ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TermGroup
  
  @JSGlobal("SP.Taxonomy.TermSet")
  @js.native
  class TermSet ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TermSet
  
  @JSGlobal("SP.Taxonomy.TermSetItem")
  @js.native
  class TermSetItem ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TermSetItem
  
  @JSGlobal("SP.Taxonomy.TermStore")
  @js.native
  class TermStore ()
    extends typingsSlinky.sharepoint.SP.Taxonomy.TermStore
}
