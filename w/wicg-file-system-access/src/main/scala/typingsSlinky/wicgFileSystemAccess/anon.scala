package typingsSlinky.wicgFileSystemAccess

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.BufferSource
import typingsSlinky.wicgFileSystemAccess.mod.global.ChooseFileSystemEntriesOptionsAccepts
import typingsSlinky.wicgFileSystemAccess.mod.global.FilePickerAcceptType
import typingsSlinky.wicgFileSystemAccess.mod.global.WriteParams
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`false`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessBooleans.`true`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.`open-directory`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.`open-file`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.`save-file`
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.seek
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.truncate
import typingsSlinky.wicgFileSystemAccess.wicgFileSystemAccessStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :false | undefined} */
  @js.native
  trait ChooseFileSystemEntriesFi extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
    
    var multiple: js.UndefOr[`false`] = js.native
    
    var `type`: js.UndefOr[`open-file`] = js.native
  }
  object ChooseFileSystemEntriesFi {
    
    @scala.inline
    def apply(): ChooseFileSystemEntriesFi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChooseFileSystemEntriesFi]
    }
    
    @scala.inline
    implicit class ChooseFileSystemEntriesFiMutableBuilder[Self <: ChooseFileSystemEntriesFi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      @scala.inline
      def setMultiple(value: `false`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setType(value: `open-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'open-file' | undefined,   multiple :true} */
  @js.native
  trait ChooseFileSystemEntriesFiAccepts extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
    
    var multiple: `true` = js.native
    
    var `type`: js.UndefOr[`open-file`] = js.native
  }
  object ChooseFileSystemEntriesFiAccepts {
    
    @scala.inline
    def apply(multiple: `true`): ChooseFileSystemEntriesFiAccepts = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooseFileSystemEntriesFiAccepts]
    }
    
    @scala.inline
    implicit class ChooseFileSystemEntriesFiAcceptsMutableBuilder[Self <: ChooseFileSystemEntriesFiAccepts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      @scala.inline
      def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `open-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.ChooseFileSystemEntriesFileOptions & {  type :'save-file'} */
  @js.native
  trait ChooseFileSystemEntriesFiExcludeAcceptAllOption extends StObject {
    
    var accepts: js.UndefOr[js.Array[ChooseFileSystemEntriesOptionsAccepts]] = js.native
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
    
    var `type`: `save-file` = js.native
  }
  object ChooseFileSystemEntriesFiExcludeAcceptAllOption {
    
    @scala.inline
    def apply(`type`: `save-file`): ChooseFileSystemEntriesFiExcludeAcceptAllOption = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChooseFileSystemEntriesFiExcludeAcceptAllOption]
    }
    
    @scala.inline
    implicit class ChooseFileSystemEntriesFiExcludeAcceptAllOptionMutableBuilder[Self <: ChooseFileSystemEntriesFiExcludeAcceptAllOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepts(value: js.Array[ChooseFileSystemEntriesOptionsAccepts]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptsUndefined: Self = StObject.set(x, "accepts", js.undefined)
      
      @scala.inline
      def setAcceptsVarargs(value: ChooseFileSystemEntriesOptionsAccepts*): Self = StObject.set(x, "accepts", js.Array(value :_*))
      
      @scala.inline
      def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      @scala.inline
      def setType(value: `save-file`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends WriteParams {
    
    var data: BufferSource | Blob | String = js.native
    
    var position: js.UndefOr[Double] = js.native
    
    var `type`: write = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: BufferSource | Blob | String, `type`: write): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: BufferSource | Blob | String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBlob(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setType(value: write): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined wicg-file-system-access.wicg-file-system-access.<global>.OpenFilePickerOptions & {  multiple :false | undefined} */
  @js.native
  trait OpenFilePickerOptionsmult extends StObject {
    
    var excludeAcceptAllOption: js.UndefOr[Boolean] = js.native
    
    var multiple: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    var types: js.UndefOr[js.Array[FilePickerAcceptType]] = js.native
  }
  object OpenFilePickerOptionsmult {
    
    @scala.inline
    def apply(multiple: js.UndefOr[Boolean] with js.UndefOr[`false`]): OpenFilePickerOptionsmult = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFilePickerOptionsmult]
    }
    
    @scala.inline
    implicit class OpenFilePickerOptionsmultMutableBuilder[Self <: OpenFilePickerOptionsmult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExcludeAcceptAllOption(value: Boolean): Self = StObject.set(x, "excludeAcceptAllOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeAcceptAllOptionUndefined: Self = StObject.set(x, "excludeAcceptAllOption", js.undefined)
      
      @scala.inline
      def setMultiple(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[FilePickerAcceptType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: FilePickerAcceptType*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Position extends WriteParams {
    
    var position: Double = js.native
    
    var `type`: seek = js.native
  }
  object Position {
    
    @scala.inline
    def apply(position: Double, `type`: seek): Position = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: seek): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends WriteParams {
    
    var size: Double = js.native
    
    var `type`: truncate = js.native
  }
  object Size {
    
    @scala.inline
    def apply(size: Double, `type`: truncate): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: truncate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: `open-directory` = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: `open-directory`): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: `open-directory`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
