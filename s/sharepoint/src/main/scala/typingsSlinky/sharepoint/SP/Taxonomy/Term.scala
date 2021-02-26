package typingsSlinky.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sharepoint.SP.BooleanResult
import typingsSlinky.sharepoint.SP.Guid
import typingsSlinky.sharepoint.SP.StringResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Term extends TermSetItem {
  
  def copy(doCopyChildren: Boolean): Term = js.native
  
  def createLabel(labelName: String, lcid: Double, isDefault: Boolean): Label = js.native
  
  def deleteAllLocalCustomProperties(): Unit = js.native
  
  def deleteLocalCustomProperty(name: String): Unit = js.native
  
  def deprecate(doDepricate: Boolean): Unit = js.native
  
  def getAllLabels(lcid: Double): LabelCollection = js.native
  
  def getDefaultLabel(lcid: Double): Label = js.native
  
  def getDescription(lcid: Double): StringResult = js.native
  
  def getIsDescendantOf(ancestorTerm: Term): BooleanResult = js.native
  
  def getPath(lcid: Double): StringResult = js.native
  
  def getTerms(pagingLimit: Double): TermCollection = js.native
  def getTerms(
    termLabel: String,
    lcid: Double,
    defaultLabelOnly: Boolean,
    stringMatchOption: StringMatchOption,
    resultCollectionSize: Double,
    trimUnavailable: Boolean
  ): TermCollection = js.native
  
  def get_description(): String = js.native
  
  def get_isDeprecated(): Boolean = js.native
  
  def get_isKeyword(): Boolean = js.native
  
  def get_isPinned(): Boolean = js.native
  
  def get_isPinnedRoot(): Boolean = js.native
  
  def get_isReused(): Boolean = js.native
  
  def get_isRoot(): Boolean = js.native
  
  def get_isSourceTerm(): Boolean = js.native
  
  def get_labels(): LabelCollection = js.native
  
  def get_localCustomProperties(): StringDictionary[String] = js.native
  
  def get_mergedTermIds(): js.Array[Guid] = js.native
  
  def get_parent(): Term = js.native
  
  def get_pathOfTerm(): String = js.native
  
  def get_pinSourceTermSet(): TermSet = js.native
  
  def get_reusedTerms(): TermCollection = js.native
  
  def get_sourceTerm(): Term = js.native
  
  def get_termSet(): TermSet = js.native
  
  def get_termSets(): TermSetCollection = js.native
  
  def get_termsCount(): Double = js.native
  
  def merge(termToMerge: Term): Unit = js.native
  
  def move(newParnt: TermSetItem): Unit = js.native
  
  def reassignSourceTerm(reusedTerm: Term): Unit = js.native
  
  def setDescription(description: String, lcid: Double): Unit = js.native
  
  def setLocalCustomProperty(name: String, value: String): Unit = js.native
}
