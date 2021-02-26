package typingsSlinky.vueInbrowserCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDoc
  extends /* key */ StringDictionary[js.Any] {
  
  var description: js.UndefOr[String] = js.native
  
  var displayName: String = js.native
  
  var docsBlocks: js.UndefOr[js.Array[String]] = js.native
  
  var events: js.UndefOr[js.Array[EventDescriptor]] = js.native
  
  var exportName: String = js.native
  
  var methods: js.UndefOr[js.Array[MethodDescriptor]] = js.native
  
  var props: js.UndefOr[js.Array[PropDescriptor]] = js.native
  
  var slots: js.UndefOr[js.Array[SlotDescriptor]] = js.native
  
  var tags: js.UndefOr[StringDictionary[js.Array[BlockTag]]] = js.native
}
object ComponentDoc {
  
  @scala.inline
  def apply(displayName: String, exportName: String): ComponentDoc = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDoc]
  }
  
  @scala.inline
  implicit class ComponentDocMutableBuilder[Self <: ComponentDoc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsBlocks(value: js.Array[String]): Self = StObject.set(x, "docsBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsBlocksUndefined: Self = StObject.set(x, "docsBlocks", js.undefined)
    
    @scala.inline
    def setDocsBlocksVarargs(value: String*): Self = StObject.set(x, "docsBlocks", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[EventDescriptor]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: EventDescriptor*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethods(value: js.Array[MethodDescriptor]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: MethodDescriptor*): Self = StObject.set(x, "methods", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[PropDescriptor]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: PropDescriptor*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    @scala.inline
    def setSlots(value: js.Array[SlotDescriptor]): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    @scala.inline
    def setSlotsVarargs(value: SlotDescriptor*): Self = StObject.set(x, "slots", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: StringDictionary[js.Array[BlockTag]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
