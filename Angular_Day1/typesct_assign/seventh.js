"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Truck = exports.Car = void 0;
var Car = /** @class */ (function () {
    function Car(s, rp, c) {
        this.speed = s;
        this.regularPrice = rp;
        this.color = c;
    }
    Car.prototype.getSalePrice = function () {
        return 0;
    };
    Car.prototype.display = function () {
        console.log("initial speed:" + this.speed);
        console.log("color:" + this.color);
        console.log("initial price:" + this.regularPrice);
    };
    return Car;
}());
exports.Car = Car;
var Truck = /** @class */ (function (_super) {
    __extends(Truck, _super);
    function Truck(s, rp, c, w) {
        var _this = _super.call(this, s, rp, c) || this;
        _this.weight = w;
        _this.regularPrice = rp;
        return _this;
    }
    Truck.prototype.getSalePrice = function () {
        if (this.weight > 2000) {
            this.totalPrice = this.regularPrice - ((this.regularPrice * 10) / 100);
        }
        else {
            this.totalPrice = this.regularPrice - ((this.regularPrice * 20) / 100);
        }
        return this.totalPrice;
    };
    Truck.prototype.display = function () {
        _super.prototype.display.call(this);
        console.log("Weight:" + this.weight);
        console.log("Sale Price:" + this.getSalePrice());
    };
    return Truck;
}(Car));
exports.Truck = Truck;
var truck = new Truck(45, 500000, 'red', 5000);
truck.display();
