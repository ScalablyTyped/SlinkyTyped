package typingsSlinky.senchaTouch.Ext.data

import typingsSlinky.senchaTouch.Ext.IEvented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProxy extends IEvented {
  /** [Method] Performs a batch of Operations in the order specified by batchOrder
  		* @param options Object Object containing one or more properties supported by the batch method:
  		* @returns Ext.data.Batch The newly created Batch
  		*/
  var batch: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], IBatch]] = js.native
  /** [Config Option] (Boolean) */
  var batchActions: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var batchOrder: js.UndefOr[String] = js.native
  /** [Method] Performs the given create operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var create: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Performs the given destroy operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  @JSName("destroy")
  var destroy_IProxy: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Returns the value of batchActions
  		* @returns Boolean
  		*/
  var getBatchActions: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of batchOrder
  		* @returns String
  		*/
  var getBatchOrder: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of model
  		* @returns String/Ext.data.Model
  		*/
  var getModel: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of reader
  		* @returns Object/String/Ext.data.reader.Reader
  		*/
  var getReader: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the value of writer
  		* @returns Object/String/Ext.data.writer.Writer
  		*/
  var getWriter: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (String/Ext.data.Model) */
  var model: js.UndefOr[js.Any] = js.native
  /** [Method] Performs the given read operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var read: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.reader.Reader) */
  var reader: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of batchActions
  		* @param batchActions Boolean The new value.
  		*/
  var setBatchActions: js.UndefOr[js.Function1[/* batchActions */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of batchOrder
  		* @param batchOrder String The new value.
  		*/
  var setBatchOrder: js.UndefOr[js.Function1[/* batchOrder */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of model
  		* @param model String/Ext.data.Model The new value.
  		*/
  var setModel: js.UndefOr[js.Function1[/* model */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of reader
  		* @param reader Object/String/Ext.data.reader.Reader The new value.
  		*/
  var setReader: js.UndefOr[js.Function1[/* reader */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the value of writer
  		* @param writer Object/String/Ext.data.writer.Writer The new value.
  		*/
  var setWriter: js.UndefOr[js.Function1[/* writer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Performs the given update operation
  		* @param operation Ext.data.Operation The Operation to perform
  		* @param callback Function Callback function to be called when the Operation has completed (whether successful or not)
  		* @param scope Object Scope to execute the callback function in
  		*/
  var update: js.UndefOr[
    js.Function3[
      /* operation */ js.UndefOr[IOperation], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Object/String/Ext.data.writer.Writer) */
  var writer: js.UndefOr[js.Any] = js.native
}

object IProxy {
  @scala.inline
  def apply(): IProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProxy]
  }
  @scala.inline
  implicit class IProxyOps[Self <: IProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatch(value: /* options */ js.UndefOr[js.Any] => IBatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batch")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchActions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchActions")(js.undefined)
        ret
    }
    @scala.inline
    def withBatchOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBatchActions(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchActions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBatchActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchActions")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBatchOrder(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBatchOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBatchOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGetModel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetReader(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getReader")(js.undefined)
        ret
    }
    @scala.inline
    def withGetWriter(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withReader(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBatchActions(value: /* batchActions */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchActions")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBatchActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchActions")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBatchOrder(value: /* batchOrder */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchOrder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBatchOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBatchOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSetModel(value: /* model */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSetReader(value: /* reader */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetReader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setReader")(js.undefined)
        ret
    }
    @scala.inline
    def withSetWriter(value: /* writer */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
    @scala.inline
    def withWriter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writer")(js.undefined)
        ret
    }
  }
  
}

