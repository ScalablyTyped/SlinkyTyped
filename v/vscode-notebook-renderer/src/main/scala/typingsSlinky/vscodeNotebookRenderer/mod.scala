package typingsSlinky.vscodeNotebookRenderer

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.vscodeNotebookRenderer.anon.OutputId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("acquireNotebookRendererApi")
    @js.native
    def acquireNotebookRendererApi(rendererId: String): NotebookRendererApi[_] = js.native
  }
  
  @js.native
  trait Disposable extends StObject {
    
    def dispose(): Unit = js.native
  }
  object Disposable {
    
    @scala.inline
    def apply(dispose: () => Unit): Disposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[Disposable]
    }
    
    @scala.inline
    implicit class DisposableMutableBuilder[Self <: Disposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait NotebookCellOutputMetadata extends StObject {
    
    /**
      * Additional attributes of a cell metadata.
      */
    var custom: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object NotebookCellOutputMetadata {
    
    @scala.inline
    def apply(): NotebookCellOutputMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotebookCellOutputMetadata]
    }
    
    @scala.inline
    implicit class NotebookCellOutputMetadataMutableBuilder[Self <: NotebookCellOutputMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom(value: StringDictionary[js.Any]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    }
  }
  
  @js.native
  trait NotebookOutput extends StObject {
    
    var data: StringDictionary[js.Any] = js.native
    
    var metadata: js.UndefOr[NotebookCellOutputMetadata] = js.native
  }
  object NotebookOutput {
    
    @scala.inline
    def apply(data: StringDictionary[js.Any]): NotebookOutput = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookOutput]
    }
    
    @scala.inline
    implicit class NotebookOutputMutableBuilder[Self <: NotebookOutput] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: NotebookCellOutputMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  @js.native
  trait NotebookOutputEventParams extends StObject {
    
    var element: HTMLElement = js.native
    
    var mimeType: String = js.native
    
    var output: NotebookOutput = js.native
    
    var outputId: String = js.native
  }
  object NotebookOutputEventParams {
    
    @scala.inline
    def apply(element: HTMLElement, mimeType: String, output: NotebookOutput, outputId: String): NotebookOutputEventParams = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], outputId = outputId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotebookOutputEventParams]
    }
    
    @scala.inline
    implicit class NotebookOutputEventParamsMutableBuilder[Self <: NotebookOutputEventParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: NotebookOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputId(value: String): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotebookRendererApi[T] extends StObject {
    
    def getState(): js.UndefOr[T] = js.native
    
    /**
      * Fired when an output is rendered. The `outputId` provided is the same
      * as the one given in `NotebookOutputRenderer.render` in the extension
      * API, and `onWillDestroyOutput`.
      */
    def onDidCreateOutput(listener: js.Function1[/* e */ NotebookOutputEventParams, _]): Disposable = js.native
    def onDidCreateOutput(
      listener: js.Function1[/* e */ NotebookOutputEventParams, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onDidCreateOutput(listener: js.Function1[/* e */ NotebookOutputEventParams, _], thisArgs: js.Any): Disposable = js.native
    def onDidCreateOutput(
      listener: js.Function1[/* e */ NotebookOutputEventParams, _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /**
      * Fired when an output is rendered. The `outputId` provided is the same
      * as the one given in `NotebookOutputRenderer.render` in the extension
      * API, and `onWillDestroyOutput`.
      */
    @JSName("onDidCreateOutput")
    var onDidCreateOutput_Original: VSCodeEvent[NotebookOutputEventParams] = js.native
    
    /**
      * Called when the renderer uses `postMessage` on the NotebookCommunication
      * instance for this renderer.
      */
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _]): Disposable = js.native
    def onDidReceiveMessage(
      listener: js.Function1[/* e */ js.Any, _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any): Disposable = js.native
    def onDidReceiveMessage(listener: js.Function1[/* e */ js.Any, _], thisArgs: js.Any, disposables: js.Array[Disposable]): Disposable = js.native
    /**
      * Called when the renderer uses `postMessage` on the NotebookCommunication
      * instance for this renderer.
      */
    @JSName("onDidReceiveMessage")
    var onDidReceiveMessage_Original: VSCodeEvent[_] = js.native
    
    /**
      * Fired before an output is destroyed, with its output ID, or undefined if
      * all cells are about to unmount.
      */
    def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], _]): Disposable = js.native
    def onWillDestroyOutput(
      listener: js.Function1[/* e */ js.UndefOr[OutputId], _],
      thisArgs: js.UndefOr[scala.Nothing],
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    def onWillDestroyOutput(listener: js.Function1[/* e */ js.UndefOr[OutputId], _], thisArgs: js.Any): Disposable = js.native
    def onWillDestroyOutput(
      listener: js.Function1[/* e */ js.UndefOr[OutputId], _],
      thisArgs: js.Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /**
      * Fired before an output is destroyed, with its output ID, or undefined if
      * all cells are about to unmount.
      */
    @JSName("onWillDestroyOutput")
    var onWillDestroyOutput_Original: VSCodeEvent[js.UndefOr[OutputId]] = js.native
    
    /**
      * Sends a message to the renderer extension code. Can be received in
      * the `onDidReceiveMessage` event in `NotebookCommunication`.
      */
    def postMessage(msg: js.Any): Unit = js.native
    
    def setState(value: T): Unit = js.native
  }
  
  type VSCodeEvent[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, js.Any], 
    /* thisArgs */ js.UndefOr[js.Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
}
