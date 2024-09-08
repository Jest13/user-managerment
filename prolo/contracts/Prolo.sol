// SPDX-License-Identifier: MIT 
pragma solidity ^0.8.7;

import "@openzeppelin/contract/token/ERC20/ERC20.sol";

contract Prolo is ERC20 {
    constructor() ERC20("Prolo", "PRO"){
        _mint(msg.sender, 1000000 * 10**18);
    }
}