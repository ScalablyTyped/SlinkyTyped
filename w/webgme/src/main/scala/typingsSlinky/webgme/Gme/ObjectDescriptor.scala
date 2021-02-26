package typingsSlinky.webgme.Gme

import typingsSlinky.webgme.GmeCommon.Dictionary
import typingsSlinky.webgme.GmeCommon.Pointer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectDescriptor extends StObject {
  
  var childrenIds: js.Array[String] = js.native
  
  var childrenNum: Double = js.native
  
  var control: js.UndefOr[VisualizerControl] = js.native
  
  var dstObjId: String = js.native
  
  var dstPos: Pos2D = js.native
  
  var dstSubCompId: js.UndefOr[String] = js.native
  
  var editable: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var isConnection: Boolean = js.native
  
  var metaInfo: js.UndefOr[Dictionary[String]] = js.native
  
  var name: String = js.native
  
  var parentId: String = js.native
  
  var pointers: Dictionary[Pointer] = js.native
  
  var position: Double = js.native
  
  var preferencesHelper: js.UndefOr[PreferenceHelper] = js.native
  
  var reconnectable: js.UndefOr[Boolean] = js.native
  
  var source: String = js.native
  
  var srcObjId: String = js.native
  
  var srcPos: Pos2D = js.native
  
  var srcSubCompId: js.UndefOr[String] = js.native
  
  var target: String = js.native
}
object ObjectDescriptor {
  
  @scala.inline
  def apply(
    childrenIds: js.Array[String],
    childrenNum: Double,
    dstObjId: String,
    dstPos: Pos2D,
    id: String,
    isConnection: Boolean,
    name: String,
    parentId: String,
    pointers: Dictionary[Pointer],
    position: Double,
    source: String,
    srcObjId: String,
    srcPos: Pos2D,
    target: String
  ): ObjectDescriptor = {
    val __obj = js.Dynamic.literal(childrenIds = childrenIds.asInstanceOf[js.Any], childrenNum = childrenNum.asInstanceOf[js.Any], dstObjId = dstObjId.asInstanceOf[js.Any], dstPos = dstPos.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isConnection = isConnection.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], srcObjId = srcObjId.asInstanceOf[js.Any], srcPos = srcPos.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDescriptor]
  }
  
  @scala.inline
  implicit class ObjectDescriptorMutableBuilder[Self <: ObjectDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildrenIds(value: js.Array[String]): Self = StObject.set(x, "childrenIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenIdsVarargs(value: String*): Self = StObject.set(x, "childrenIds", js.Array(value :_*))
    
    @scala.inline
    def setChildrenNum(value: Double): Self = StObject.set(x, "childrenNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: VisualizerControl): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    @scala.inline
    def setDstObjId(value: String): Self = StObject.set(x, "dstObjId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstPos(value: Pos2D): Self = StObject.set(x, "dstPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstSubCompId(value: String): Self = StObject.set(x, "dstSubCompId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDstSubCompIdUndefined: Self = StObject.set(x, "dstSubCompId", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsConnection(value: Boolean): Self = StObject.set(x, "isConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaInfo(value: Dictionary[String]): Self = StObject.set(x, "metaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaInfoUndefined: Self = StObject.set(x, "metaInfo", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointers(value: Dictionary[Pointer]): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferencesHelper(value: PreferenceHelper): Self = StObject.set(x, "preferencesHelper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferencesHelperUndefined: Self = StObject.set(x, "preferencesHelper", js.undefined)
    
    @scala.inline
    def setReconnectable(value: Boolean): Self = StObject.set(x, "reconnectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectableUndefined: Self = StObject.set(x, "reconnectable", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcObjId(value: String): Self = StObject.set(x, "srcObjId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPos(value: Pos2D): Self = StObject.set(x, "srcPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSubCompId(value: String): Self = StObject.set(x, "srcSubCompId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcSubCompIdUndefined: Self = StObject.set(x, "srcSubCompId", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
