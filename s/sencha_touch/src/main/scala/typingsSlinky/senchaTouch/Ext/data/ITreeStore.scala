package typingsSlinky.senchaTouch.Ext.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeStore extends INodeStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[String] = js.native
  /** [Method] Get the Record with the specified id
  		* @param id Object
  		* @returns Ext.data.Model/undefined The Record with the passed id. Returns undefined if not found.
  		*/
  @JSName("getById")
  var getById_ITreeStore: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Returns the value of clearOnLoad
  		* @returns Boolean
  		*/
  var getClearOnLoad: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns the value of defaultRootId
  		* @returns String
  		*/
  var getDefaultRootId: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of defaultRootProperty
  		* @returns String
  		*/
  var getDefaultRootProperty: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the record node by id
  		* @param id Object
  		* @returns Ext.data.NodeInterface
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.native
  /** [Method] Returns the value of nodeParam
  		* @returns String
  		*/
  var getNodeParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the value of root
  		* @returns Ext.data.Model/Ext.data.NodeInterface/Object
  		*/
  var getRoot: js.UndefOr[js.Function0[_]] = js.native
  /** [Method] Returns the root node for this tree
  		* @param node Object
  		* @returns Ext.data.Model
  		*/
  var getRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[js.Any], IModel]] = js.native
  /** [Method] Loads the Store using its configured proxy
  		* @param options Object config object. This is passed into the Operation object that is created and then sent to the proxy's Ext.data.proxy.Proxy.read function. The options can also contain a node, which indicates which node is to be loaded. If not specified, it will default to the root node.
  		* @returns Object
  		*/
  @JSName("load")
  var load_ITreeStore: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[String] = js.native
  /** [Method] Called internally when a Proxy has completed a load request
  		* @param operation Object
  		*/
  var onProxyLoad: js.UndefOr[js.Function1[/* operation */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the value of clearOnLoad
  		* @param clearOnLoad Boolean The new value.
  		*/
  var setClearOnLoad: js.UndefOr[js.Function1[/* clearOnLoad */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Method] Sets the value of defaultRootId
  		* @param defaultRootId String The new value.
  		*/
  var setDefaultRootId: js.UndefOr[js.Function1[/* defaultRootId */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of defaultRootProperty
  		* @param defaultRootProperty String The new value.
  		*/
  var setDefaultRootProperty: js.UndefOr[js.Function1[/* defaultRootProperty */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of nodeParam
  		* @param nodeParam String The new value.
  		*/
  var setNodeParam: js.UndefOr[js.Function1[/* nodeParam */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Sets the value of root
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object The new value.
  		*/
  var setRoot: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the root node for this tree
  		* @param node Ext.data.Model
  		* @returns Ext.data.Model
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[IModel], IModel]] = js.native
}

object ITreeStore {
  @scala.inline
  def apply(): ITreeStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreeStore]
  }
  @scala.inline
  implicit class ITreeStoreOps[Self <: ITreeStore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRootProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetById(value: /* id */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetClearOnLoad(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearOnLoad")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetClearOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClearOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultRootId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultRootId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultRootId")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDefaultRootProperty(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultRootProperty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDefaultRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDefaultRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeById(value: /* id */ js.UndefOr[js.Any] => INodeInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNodeById: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeById")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNodeParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRoot(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRootNode(value: /* node */ js.UndefOr[js.Any] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRootNode")(js.undefined)
        ret
    }
    @scala.inline
    def withLoad(value: /* options */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProxyLoad(value: /* operation */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProxyLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProxyLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withSetClearOnLoad(value: /* clearOnLoad */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearOnLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetClearOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setClearOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultRootId(value: /* defaultRootId */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRootId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultRootId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRootId")(js.undefined)
        ret
    }
    @scala.inline
    def withSetDefaultRootProperty(value: /* defaultRootProperty */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRootProperty")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetDefaultRootProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRootProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSetNodeParam(value: /* nodeParam */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNodeParam")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetNodeParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNodeParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRoot(value: /* root */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRoot")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRootNode(value: /* node */ js.UndefOr[IModel] => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetRootNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRootNode")(js.undefined)
        ret
    }
  }
  
}

