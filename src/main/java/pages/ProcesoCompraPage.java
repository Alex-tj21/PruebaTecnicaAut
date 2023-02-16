package pages;

import lombok.Getter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
@Getter
public class ProcesoCompraPage extends PageObject{

	@FindBy(xpath="//i[@class='s-sidebar-icon fa fa-anchor']")
	private WebElementFacade lstMenu;

	@FindBy(xpath="//i[@class='s-sidebar-icon fa fa-shopping-cart']")
	private WebElementFacade lstSubMenu;

	@FindBy(xpath="//i[@class='fa fa-plus-circle text-green']")
	private WebElementFacade btnNewOrder;

	@FindBy(id="s2id_Serenity_Demo_Northwind_OrderDialog15_CustomerID")
	private WebElementFacade lstCliente;

	@FindBy(id="s2id_autogen8_search")
	private WebElementFacade txtCliente;

	@FindBy(name="OrderDate")
	private WebElementFacade txtFechaOrden;

	@FindBy(id="select2-chosen-9")
	private WebElementFacade lstEmpleado;

	@FindBy(id="s2id_autogen9_search")
	private WebElementFacade txtEmpleado;

	@FindBy(xpath="//div[@class='button-outer']/span[contains(text(),\" New Order Detail\")]")
	private WebElementFacade btnProducto;

	@FindBy(id="s2id_Serenity_Demo_Northwind_OrderDetailDialog33_ProductID")
	private WebElementFacade lstProducto;

	@FindBy(id="s2id_autogen245_search")
	private WebElementFacade txtProducto;

	@FindBy(id="Serenity_Demo_Northwind_OrderDetailDialog33_Quantity")
	private WebElementFacade txtCantidad;

	@FindBy(id="Serenity_Demo_Northwind_OrderGrid0_QuickFilter_OrderDate")
	private WebElementFacade txtConsultarFecha;

	@FindBy(xpath="//*[@class=\"slick-cell l3 r3\"]/a")
	private WebElementFacade lblValidarCompra;




}
