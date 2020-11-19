package typingsSlinky.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataReaderFactory extends js.Object {
  
  def createDataReader(inputStream: IInputStream): DataReader = js.native
}
object IDataReaderFactory {
  
  @scala.inline
  def apply(createDataReader: IInputStream => DataReader): IDataReaderFactory = {
    val __obj = js.Dynamic.literal(createDataReader = js.Any.fromFunction1(createDataReader))
    __obj.asInstanceOf[IDataReaderFactory]
  }
  
  @scala.inline
  implicit class IDataReaderFactoryOps[Self <: IDataReaderFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateDataReader(value: IInputStream => DataReader): Self = this.set("createDataReader", js.Any.fromFunction1(value))
  }
}
